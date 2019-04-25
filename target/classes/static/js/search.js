$(document).ready(function(){
    $('#searchStr').keyup(function(){
//    	var data = $("#searchBar").serialize()
    	var data = {
    			param1:$("#searchBar").serialize(),
    			param2:$("#coverage").serialize()
    	}
        		
        $.ajax({
            method: "POST",   // we are using a post request here, but this could also be done with a get
            url: "/drugs/search",
            data: data
        })
        .done(function(res){
             $('#theTable').html(res)  // manipulate the dom when the response comes back
        })
    })
    $('#coverage').change(function(){
    	var data = {
    			param1:$("#searchBar").serialize(),
    			param2:$("#coverage").serialize()
    	}
        		
        $.ajax({
            method: "POST",   // we are using a post request here, but this could also be done with a get
            url: "/drugs/search",
            data: data
        })
        .done(function(res){
             $('#theTable').html(res)  // manipulate the dom when the response comes back
        })
    })
})