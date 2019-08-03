           // 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
            var html = "<html><head><meta charset='utf-8' /></head><body>" + document.getElementById("demo-custom-toolbar").outerHTML + "</body></html>";
            // 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
            var blob = new Blob([html], {
                type: "application/vnd.ms-excel"
            });
            var a = document.getElementById("print-click");
            // 利用URL.createObjectURL()方法为a元素生成blob URL
            a.href = URL.createObjectURL(blob);
            // 设置文件名，目前只有Chrome和FireFox支持此属性
            a.download = "供应商.xls";
 
            function download() {
                debugger
                    // 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
                    var html2 = "<html><head><meta charset='utf-8' /></head><body>" + document.getElementById("demo-custom-toolbar").outerHTML + "</body></html>";
                    // 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
                    var blob2 = new Blob([html2], {
                        type: "application/vnd.ms-excel"
                    });
                    saveAs(blob2, "供应商.xls");
            };
              //打印具体实现代码
           function printout() {
                debugger;
                var newWindow;
                //打开一个新的窗口  
                newWindow = window.open();
                // 是新窗口获得焦点  
                newWindow.focus();
                //保存写入内容  
                var newContent = "<html><head><meta charset='utf-8'/><title>打印</title></head><body>"
                newContent += document.getElementById("demo-custom-toolbar").outerHTML;
                newContent += "</body></html>"
                // 将HTML代码写入新窗口中  
                newWindow.document.write(newContent);
                newWindow.print();
                // close layout stream 
                newWindow.document.close();
                //关闭打开的临时窗口
                newWindow.close();
                return false;
           };