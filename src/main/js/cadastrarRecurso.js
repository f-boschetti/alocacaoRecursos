"use strict";

//hide quantity field when the resource is a room

var category = document.querySelector('.dropdownCategoryOption');
document.querySelector('.roomNumberColumn').style.display = "none";

category.addEventListener("change", function(evt) {

    var aux = category.options[category.selectedIndex].text; //value to get the index

    if (aux === 'Salas') {
	document.querySelector('.quantityColumn').style.display = "none";
	document.querySelector('.roomNumberColumn').style.display = "block";
    }
    else {
	document.querySelector('.quantityColumn').style.display = "block";
	document.querySelector('.roomNumberColumn').style.display = "none";
    }
})







