
function highlightRow(resultId) {
    // Remove highlighting
    document.querySelectorAll("tr.highlight").forEach((el) => {
        el.classList.remove("highlight");
    })

    document.getElementById(resultId)?.classList.add("highlight");
}
