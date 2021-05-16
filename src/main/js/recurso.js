"use strict"

var transferResourceSpace = document.querySelector(".TransferirRecurso");
var qntColumn = document.querySelector(".quantityColumn");

function compartilharRecurso() {
    transferResourceSpace.classList.remove("hidden");
    qntColumn.classList.remove('hidden');
}

function trocarResponsavel() {
    transferResourceSpace.classList.remove("hidden");
    qntColumn.classList.add('hidden');
}

function transferConfirmation() {
    
}

