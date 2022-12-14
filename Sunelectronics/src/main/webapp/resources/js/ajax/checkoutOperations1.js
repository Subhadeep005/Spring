/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * Intercept add to cart operations and perform them via AJAX instead.
 *  This will trigger on any input with class "addToCart" or "addToWishlist"
 */

$(document).ready(function() {
	
	$("#addressPopupDisplayBtn").on("click",function(event) {
		event.preventDefault();
		
		$('#addressPopupBox').css("display","block");		
		
		/*$('#addressPopupBox').fadeOut( "slow", function() {
			$('#addressPopupDisplayBtn').prop("disabled", false);
		});*/
	
		return false;
		
	});
	
	$(".addressPopupBoxHeader button").on("click",function(event) {
		event.preventDefault();
		
		$('#addressPopupBox').css("display","none");

		return false;
		
	});
	
});



//Serialize form data
function serializeObject($form){
	return $form.serialize()+'&sunAjax=true';
}

//displaying message after successful add, update and remove
function displaySuccessMessage($btnType, $message){
	$('#alert-autocloseable-success strong').html($message);
	$('#alert-autocloseable-success').css("display","block");

	$('#alert-autocloseable-success').delay(1000).fadeOut( "slow", function() {
		$($btnType).prop("disabled", false);
	});
	$('#alert-autocloseable-success').css("display:none");
	return true;
}



//Remove Item From Cart
/*$(document).on("click",".removeItemBox button",function(event) {
	event.preventDefault();
	
	var $form = $(this).parent();

	$('.removeItemBox button').prop("disabled", true);
	
	$.ajax({
		type: 'POST',
		url: $form.attr('action'),
		data: serializeObject($form),
		cache: false,
		success: function(response){
			//var arr = $.map(response, function(data) { return data });
			
			$('#cartView').load(" #cartView");
			$('#cart').load(" #cart");

			displaySuccessMessage('.removeItemBox button', 'Item has been removed successfully!');
		}				
	});	
	return false;
	
});*/
