;
(function(window,document,$,Hogan){
	$(function(){
		init();
		bindEvent();
	});
	var customerCode = null,
	storeCode = null,
	hoganTemplate = null;
	var init = function() {
		customerCode = $("#customerCode");
		storeCode = $("#storeCode");
		hoganTemplate = Hogan.compile($('#recordTmpl').html());
	};
	
	var bindEvent = function() {
		customerCode.on('change', function(event) {
			var self = $(this);
			if('all' == self.val()) {
				storeCode.html('<option value="all">all</option>');
				return false;
			}
			$.ajax({
				type:"GET",
				url:ctx + '/api/ccustomer',
				data:'ccustomer=' + self.val(),
				datatype:'json',
				success:function(res) {
					//alert(res);
					storeCode.html(hoganTemplate.render({
						storeList:res.data
					}));
				}
			});
		});
	};
})(window,document,jQuery,Hogan);