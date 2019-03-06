$(function () {

    const pushToStack = (input) => {
        $.post("/stack", {action: "push", input: input}).done();
    };

    const popFromStack = () => {
        $.post("/stack", {action: "pop"}).done();
    };

    const resetStack = () => {
        $.post("/stack", {action: "reset"}).done();
    };

    const updateView = () => {
        $.get("/stack", {action: "view"}).done((data) => {
            $("#stack-list").html("");

            let stackArray = data.stack.reverse();
            stackArray.forEach((element) => {
                $("#stack-list").append('<p class="bg-info">' + element + '</p>')
            });
        });
    };

    const isValid = (input) => {
        var re = /^((\d)+)$/;
        return input.match(re);
    };

    const removeAlert = () => $(".alert").remove();

    const notify = (level = 'success', message) => {
        $(".form-group")
            .first()
            .append(`<div class="alert alert-${level}" role="alert">${message}</div>`);
    };
    // *****************
    // EVENTS:
    $("#push").click(() => {
        removeAlert();

        let value = $("#input").val();
        if (!isValid(value)) {
            notify('danger', 'Input validation failed. Only integer values allowed!');
            return false;
        }

        pushToStack(value);
    });
    $("#pop").click(() => {
        removeAlert();
        popFromStack()
    });
    $("#reset").click(() => {
        removeAlert();
        resetStack()
    });
    $("#view").click(() => {
        removeAlert();
        updateView()
    });
});