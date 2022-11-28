<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>The Cinema</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<link href="css/general.css" rel="stylesheet" type="text/css" />
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>

</style>
</head>

<body>
    <!--Row 1-->
    <div class="">
        <div class="row header-menu d-flex justify-content-center" style="background-color: #343a40;" >

            <div class="column col-sm-2 d-flex flex-column justify-content-center" style="max-width:120px;cursor:pointer;" >
                <a class="" href="/purchaseapi/Home.jsp" style="text-decoration:none;">
                <div class="flex-column justify-content-center">
                    <div class="col-sm-6 d-flex justify-content-center" style="width:100%;" >
                        <img class="img-fluid d-flex justify-content-center" style="min-width:60px;max-width:60px;"  src="https://us.123rf.com/450wm/pxlprostudio/pxlprostudio1907/pxlprostudio190701502/pxlprostudio190701502.jpg?ver=6" alt="logo">
                    </div>
                    <div class="col-sm-6 d-flex text" style="min-width:120px;">The Cinema</div>
                </div>
                </a>
            </div>

        </div>

        <!--Row 2-->
        <div>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark justify-content-center">
                  <ul class="navbar-nav ">
                    <li class="nav-item active nav-width">
                        <a class="nav-link px-5" href="/purchaseapi/Home.jsp">Movie Shows</a>
                    </li>
                    <li class="nav-item nav-width">
                      <a class="nav-link px-5" href="/purchaseapi/Promotion.jsp">Promotions</a>
                    </li>
                    <li class="nav-item nav-width">
                      <a class="nav-link px-5" href="/purchaseapi/FoodNBeverage.jsp">Food & Beverages</a>
                    </li>
                    <li class="nav-item nav-width">
                        <a class="nav-link px-5" href="/purchaseapi/AboutUs.jsp" >About Us</a>
                        <!--px-5 hover-elem-->
                    </li>
                  </ul>
                </nav>
        </div>

        <!--Row 3-->
        <div class="row">
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>ReleaseDate</th>
                    <th>Description</th>
                </tr>
            </table>
        </div>

    </div>
</body>

