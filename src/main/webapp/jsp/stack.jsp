<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/main.js"></script>
</head>

<body>
<div class="container">

    <div class="row">
        <div class="col-md-4">
            <form>
                <div class="form-group">
                    <div class="input-group">
                        <input type="text" id="input" class="form-control" placeholder="Add Integer to the Stack">
                        <span class="input-group-btn">
                            <button class="btn btn-default" id="push" type="button">Push</button>
                        </span>
                    </div>
                </div>

                <div class="form-group">
                    <div class="input-group">
                        <input type="button" class="btn btn-primary" id="pop" value="Pop">
                        <input type="button" class="btn btn-danger" id="reset" value="Reset">
                        <input type="button" class="btn btn-primary" id="view" value="View">
                    </div>
                </div>
            </form>
        </div>
    </div>

    <div class="row">
        <div class="col-md-1 text-center" id="stack-list"></div>
    </div>
</div>
</body>
</html>