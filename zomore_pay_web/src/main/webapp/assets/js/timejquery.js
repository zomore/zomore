/**
*
*chenzhijie
* 
*/
			jQuery(document).ready(function() {

				
				
				//colorpicker start

                $('.colorpicker-default').colorpicker({
                    format: 'hex'
                });
                $('.colorpicker-rgba').colorpicker();
                
                // Date Picker
                jQuery('#datepicker').datepicker();
                jQuery('#datepicker-autoclose').datepicker({
                	autoclose: true,
                	todayHighlight: true
                });
                jQuery('#datepicker-inline').datepicker();
                jQuery('#datepicker-multiple-date').datepicker({
                    format: "yyyy/dd/mm",
					clearBtn: true,
					multidate: true,
					multidateSeparator: ","
                });
                jQuery('#date-range').datepicker({
                    toggleActive: true
                });
                
                //Clock Picker
                $('.clockpicker').clockpicker({
                	donetext: 'Done'
                });
                
                $('#single-input').clockpicker({
				    placement: 'bottom',
				    align: 'left',
				    autoclose: true,
				    'default': 'now'
				});
				$('#check-minutes').click(function(e){
				    // Have to stop propagation here
				    e.stopPropagation();
				    $("#single-input").clockpicker('show')
				            .clockpicker('toggleView', 'minutes');
				});
				
				
				//Date range picker
				$('.input-daterange-datepicker').daterangepicker({
					buttonClasses: ['btn', 'btn-sm'],
		            applyClass: 'btn-default',
		            cancelClass: 'btn-white'
				});
		        $('.input-daterange-timepicker').daterangepicker({
		            timePicker: true,
		            format: 'YYYY/DD/MM h:mm A',
		            timePickerIncrement: 30,
		            timePicker12Hour: true,
		            timePickerSeconds: false,
		            buttonClasses: ['btn', 'btn-sm'],
		            applyClass: 'btn-default',
		            cancelClass: 'btn-white'
		        });
		        $('.input-limit-datepicker').daterangepicker({
		            format: 'YYYY/DD/MM',
		            minDate: '2019/01/01',
		            maxDate: '2019/01/01',
		            buttonClasses: ['btn', 'btn-sm'],
		            applyClass: 'btn-default',
		            cancelClass: 'btn-white',
		            dateLimit: {
		                days: 6
		            }
		        });
		
		        $('#reportrange span').html(moment().subtract(29, 'days').format('YYYY D, MMMM') + ' - ' + moment().format('YYYY D, MMMM'));
		
		        $('#reportrange').daterangepicker({
		            format: 'MM/DD/YYYY',
		            startDate: moment().subtract(29, 'days'),
		            endDate: moment(),
		            minDate: '01/01/2012',
		            maxDate: '12/31/2015',
		            dateLimit: {
		                days: 60
		            },
		            showDropdowns: true,
		            showWeekNumbers: true,
		            timePicker: false,
		            timePickerIncrement: 1,
		            timePicker12Hour: true,
		            ranges: {
		                'Today': [moment(), moment()],
		                'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
		                'Last 7 Days': [moment().subtract(6, 'days'), moment()],
		                'Last 30 Days': [moment().subtract(29, 'days'), moment()],
		                'This Month': [moment().startOf('month'), moment().endOf('month')],
		                'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
		            },
		            opens: 'left',
		            drops: 'down',
		            buttonClasses: ['btn', 'btn-sm'],
		            applyClass: 'btn-default',
		            cancelClass: 'btn-white',
		            separator: ' to ',
		            locale: {
		                applyLabel: 'Submit',
		                cancelLabel: 'Cancel',
		                fromLabel: 'From',
		                toLabel: 'To',
		                customRangeLabel: 'Custom',
		                daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],
		                monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
		                firstDay: 1
		            }
		        }, function (start, end, label) {
		            console.log(start.toISOString(), end.toISOString(), label);
		            $('#reportrange span').html(start.format('YYYY D,MMMM ') + ' - ' + end.format('YYYY D, MMMM'));
		        });
				
			});