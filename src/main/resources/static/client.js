$(document).ready(function(){
    init();
});

function init(){
    enable();
}

function enable(){
    // $("#loginAccount").on("click", goSearchPage);
    // $("#createAccount").on("click", goActivationPage);
    // $("#btnAlerts").on("click", goAlertsPage);


}
function goHowItWorksPage(){
    window.location.href = "/howitworks"
}
function goAlertsPage(){
    window.location.href = "/alerts"
}
function goActivationPage(){
    window.location.href = "/activation"
}

function goSearchPage(){
    window.location.href = "/search"
}
function goResultsPage() {
    window.location.href = "/results"
}
function goAboutPage(){
    window.location.href = "/about"
}

function goHomePage(){
    window.location.href = "/"
}

