package com.zomore.controller;

import com.zomore.controller.analysis.PrintBook;
import com.zomore.controller.analysis.PrintObject;
import com.zomore.domain.GoodsInfo;
import com.zomore.utils.PropertiesUtils;
import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.awt.print.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PrintTicket implements Printable {

    private Map<String, Object> dataMap = new LinkedHashMap<String, Object>();

    private PrintBook printBook;

    public PrintTicket() {

    }

    public PrintTicket(PrintBook printBook, Map<String, Object> dataMap) {
        this.dataMap = dataMap;
        this.printBook = printBook;
    }

    private static final Pattern pattern = Pattern.compile("\\{(.*?)\\}");
    private static Matcher matcher;

    private Matcher matcher(String tagerStr) {
        matcher = pattern.matcher(tagerStr);
        while (matcher.find()) {
            return matcher;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        // 此 Graphics2D 类扩展 Graphics 类，以提供对几何形状、坐标转换、颜色管理和文本布局更为复杂的控制。
        // 它是用于在 Java(tm) 平台上呈现二维形状、文本和图像的基础类。
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setColor(Color.black);// 设置打印颜色为黑色

        // 打印起点坐标
        double x = pageFormat.getImageableX(); // 返回与此 PageFormat相关的 Paper对象的可成像区域左上方点的 x坐标。
        double y = pageFormat.getImageableY(); // 返回与此 PageFormat相关的 Paper对象的可成像区域左上方点的 y坐标。

        List<PrintObject> headerList = printBook.getHeader();
        float line = 0f; // 行高
        line = commonPrint(headerList, g2, x, y, line, true, false); // 解析打印header

        line += (g2.getFont().getSize() + 3);
        List<PrintObject> goodsList = printBook.getGooods();
        line = commonPrint(goodsList, g2, x, y, line, false, false); // 解析商品头
        line += 5;
        // 虚线设置
        g2.setStroke(new BasicStroke(1f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 4.0f, new float[] { 4.0f }, 0.0f));
        // 在此图形上下文的坐标系中使用当前颜色在点 (x1, y1) 和 (x2, y2) 之间画一条线。 即绘制虚线
        g2.drawLine((int) x, (int) (y + line), (int) x + 158, (int) (y + line));
        line += (g2.getFont().getSize());
        List<GoodsInfo> goodsInfoList = (List<GoodsInfo>) dataMap.get("goodInfos");
        if (goodsInfoList != null && goodsInfoList.size() > 0) {
            for (GoodsInfo goodInfo : goodsInfoList) {
                PrintObject p = new PrintObject();
                p.setText(goodInfo.getName());
                p.setLine(true);
                p.setBold(false);
                p.setFont("宋体");
                p.setSize(8);
                p.setX("0");
                p.setY("");
                PrintObject p1 = new PrintObject();
                p1.setText(goodInfo.getPrice());
                p1.setLine(false);
                p1.setBold(false);
                p1.setFont("宋体");
                p1.setSize(8);
                p1.setX("55");
                p1.setY("");
                PrintObject p2 = new PrintObject();
                p2.setText(goodInfo.getNum());
                p2.setLine(false);
                p2.setBold(false);
                p2.setSize(8);
                p2.setFont("宋体");
                p2.setX("85");
                p2.setY("");
                PrintObject p3 = new PrintObject();
                p3.setText(goodInfo.getTotal());
                p3.setLine(false);
                p3.setBold(false);
                p3.setSize(8);
                p3.setFont("宋体");
                p3.setX("115");
                p3.setY("");
                List<PrintObject> l =new ArrayList<>();
                l.add(p);
                l.add(p1);
                l.add(p2);
                l.add(p3);

                line = commonPrint(l, g2, x, y, line, false, false); // 解析商品头
                line += 10;
                /*g2.drawString(goodInfo.getName(), (float) x , (float) y + line);*/
               /* g2.drawString(goodInfo.getPrice(), (float) x + 60, (float) y + line);
                g2.drawString(goodInfo.getNum(), (float) x + 95, (float) y + line);
                g2.drawString(goodInfo.getTotal(), (float) x + 120, (float) y + line);*/
            }
        }
        // 结束虚线
        g2.drawLine((int) x, (int) (y + line), (int) x + 158, (int) (y + line));
        line += (g2.getFont().getSize() + 3);

        List<PrintObject> footList = printBook.getFooter();
        line = commonPrint(footList, g2, x, y, line, false, true); // 解析打印footer
        line += 5;

        switch (pageIndex) {
            case 0:
                return PAGE_EXISTS;
            default:
                return NO_SUCH_PAGE;
        }
    }

    /**
     * 公共解析
     *
     * @param printObjectList
     * @param g2
     * @param x
     * @param y
     * @return
     * @see
     */
    public float commonPrint(List<PrintObject> printObjectList, Graphics2D g2, double x, double y, float line, boolean header, boolean footer) {
        int index = 0;
        for (PrintObject print : printObjectList) {
            Font font = null; // 创建字体
            if (print != null && print.getBold()) { // 是否加粗字体
                font = new Font(print.getFont(), Font.BOLD, print.getSize());
            } else {
                font = new Font(print.getFont(), Font.PLAIN, print.getSize());
            }
            g2.setFont(font);// 设置打印字体

            float heigth = font.getSize2D();

            if (header && index == 0) {
                line += g2.getFont().getSize();
            }

            Matcher matcher = matcher(print.getText()); // 匹配字符
            String text = "";
            if (matcher == null) {
                text = print.getText();
            } else {
                String matherKey = matcher.group(0);
                String mapKey = matcher.group(1);
                text = print.getText().replace(matherKey, String.valueOf(dataMap.get(mapKey)));
            }

            g2.drawString(text, (float) x + new Float(print.getX()), (float) y + (StringUtils.isNotBlank(print.getY()) ? new Float(print.getY()) : line));

            if (index == printObjectList.size() - 1) {
                break;
            }
            if (print.getLine() != null && print.getLine()) {
                line += (heigth + (print.getLinewidth() != null ? print.getLinewidth() : 3)); // 下一行开始打印的高度
            }

            index++;
        }
        return line;
    }

    public void printer() {
        try {
            // Book 类提供文档的表示形式，该文档的页面可以使用不同的页面格式和页面 painter
            Book book = new Book(); // 要打印的文档

            // PageFormat类描述要打印的页面大小和方向
            PageFormat pf = new PageFormat(); // 初始化一个页面打印对象
            pf.setOrientation(PageFormat.PORTRAIT); // 设置页面打印方向，从上往下，从左往右

            // 设置打印纸页面信息。通过Paper设置页面的空白边距和可打印区域。必须与实际打印纸张大小相符。
            Paper paper = new Paper();
			/*double width = new Double(PropertiesUtils.getString("paper.width"));
			double height = new Double(PropertiesUtils.getString("paper.height"));*/
            paper.setSize(158,30000); // A4纸张大小
            paper.setImageableArea(0,0,158,30000); // 打印区域
            pf.setPaper(paper);

            book.append(this, pf);
            System.setProperty("java.awt.headless", "true");
            PrinterJob job = PrinterJob.getPrinterJob(); // 获取打印服务对象
            job.setPageable(book); // 设置打印类

            // 获取可用的打印机服务
            // PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
            // DocFlavor flavor = DocFlavor.BYTE_ARRAY.PNG;
            // 可用的打印机列表(字符串数组)
            // PrintService[] printService = PrintServiceLookup.lookupPrintServices(flavor, pras);
            // for (int i = 0; i < printService.length; i++) {
            // System.out.println(printService[i].getName());
            // }
            // 当前默认打印机
            // PrintService ps = PrintServiceLookup.lookupDefaultPrintService();
            // ps.getName();

            // job.setPrintService(printService[1]);

            int isCommit = Integer.parseInt(PropertiesUtils.getString("print.commit"));
            if (isCommit == 1) {
                job.print();
            } else {

                if(isOSLinux()){
                    job.print();//修改过后的
                }else {
               /* // 可以用printDialog显示打印对话框,在用户确认后打印
                boolean a = job.printDialog();*/

            job.print();

                }
            }
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
    //判断当前系统是linux还是Windows系统
    public static boolean isOSLinux() {
        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        if (os != null && os.toLowerCase().contains("linux")) {
            return true;
        } else {
            return false;
        }
    }
}

