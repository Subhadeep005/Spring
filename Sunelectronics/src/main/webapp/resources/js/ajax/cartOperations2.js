$(document).ready(function(){
	
		$(".addItemBox button").on("click", function(event){
			event.preventDefault();
			var $form = $(this).parent();
			//alert('Testing');
			$.ajax({
				type: 'POST',
				url: $form.attr('action'),
				data: $form.serialize(),
				cache: false,
				success: function(response){
					var arr = $.map(response, function(data) { return data });
					var q = parseInt(arr[1]);
					quantity += q;
					$('#total-cart-items').html(quantity);
				}
			});
			return false;
		});
});