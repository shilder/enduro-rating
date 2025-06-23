function isBlank(str) {
    return str === undefined || str === null || str.trim() === "";
}

function onNavigateHandler(event) {
    document.querySelectorAll(".highlight").forEach((el) => {
        console.log("Removing HL for", el);
        el.classList.remove("highlight");
    })

    const fragment = document.location.hash;
    if (!isBlank(fragment)) {
        resultId = fragment.substring(1);
        document.getElementById(resultId)?.classList.add("highlight");
    }
}

window.addEventListener("popstate", onNavigateHandler);
