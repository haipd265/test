<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="teststyle.css">
        <!--<link rel="stylesheet" href="css/bootstrap.min.css">-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/stylelogin.css">
        <!--<link rel="stylesheet" href="teststyle.css"/>-->
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        <title>Login</title>
    </head>

    <body>
        <c:set var="size" value="${sessionScope.size}"></c:set>
            <div class="head">
                <!--<div class="content-head">VIVU Milk xin hân hạnh được phục vụ quý khách</div>-->
                <div class="content-head">
                    <div style="display: flex">
                        <img style="height: 48px;width: 48px;border-radius: 50%;background-color: white" src="img/logo/Logo.png">
                        <p style="margin:auto 0">VIVU Milk hân hạnh phục vụ quý khách</p>
                    </div>
                </div>
                <div class="giuacontent"><a style="font-family: cursive;color: rgb(0, 134, 179);"class="icont" href="home"><ion-icon name="home"></ion-icon>VIVU MILK</a></div>

            <c:if test="${sessionScope.nick!=null}">
                <div class="logina" style="display: flex;">    

                    <div style="display: flex;margin:0 auto">
                        <div class="dropdown">
                            <div class="dropbtn"><a href="profile?user=${sessionScope.nick.username}">${sessionScope.nick.logo}</a></div>
                            <div class="dropdown-content">
                                <div class="ab" style="text-align: center">
                                    <a href="profile?user=${sessionScope.nick.username}">Profile</a>
                                    <a href="">Change password</a>
                                    <a href="login">Logout</a>
                                </div>
                            </div>
                        </div>   
                        <c:if test="${sessionScope.size==null}">
                            <div class="cart" style="position: relative;">                   
                                <div ><a href="MyCart.jsp"><img src="img/cart/shopping.jpg" style="width: 20px;height: 20px;border-radius:5px"></a></div>
                                <div  style="background-color: red;color:white;position: relative;bottom: 10px;left: 17px;width: 20px;border-radius: 50%;text-align: center">${sessionScope.size}</div>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.size!=null}">
                            <div class="cart" style="position: relative;">                   
                                <div style="position: absolute"><a class="anhshop" href="MyCart.jsp"><img src="img/cart/shopping.jpg" style="width: 20px;height: 20px;border-radius:5px"></a></div>
                                <div  style="background-color: red;color:white;position: relative;bottom: 10px;left: 17px;width: 20px;border-radius: 50%;text-align: center">${sessionScope.size}</div>
                            </div>
                        </c:if>
                    </div>          

                </div>
            </c:if>

            <c:if test="${sessionScope.nick==null}">
                <div class="login" style="width: 7%;margin-left: 4%;margin-right: 4%;text-align: center"><a href="login.jsp">Login</a></div>
            </c:if>
        </div>

        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel" style="margin-top:49px">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img style="height: 300px" src="http://seller.awesomedairy.com/wp-content/uploads/2021/06/pngtree-taobao-pure-milk-promotion-carnival-poster-banner-background-image_153800.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>First slide label</h5>
                        <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img style="height: 300px" src="https://png.pngtree.com/thumb_back/fw800/back_our/20190622/ourmid/pngtree-blue-minimalist-milk-breakfast-banner-background-image_220965.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Second slide label</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img style="height: 300px"  src="https://www.wallpaperuse.com/wallp/70-706830_m.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Third slide label</h5>
                        <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev" style="height: 10px;margin:auto 0;">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next" style="height: 10px;margin:auto 0;">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <div class="search">
            <form action="search">
                <div class="fix">
                    <input type="text" placeholder="Tìm kiếm sản phẩm......" name="key">
                    <!--<button onclick="this.form.submit()">Find</button>-->
                    <button onclick="this.form.submit()"><ion-icon name="search-circle-outline"></ion-icon></button>
                </div>
            </form>
        </div>

        <div class="contain">
            <div class="option">
                <form>
                    <ul>
                        <li><a href="tab?id=1">Tăng chiều cao</a></li>
                        <li><a href="tab?id=2">Người cao tuổi</a></li>
                        <li><a href="tab?id=3">Trẻ em</a></li>
                        <li><a href="tab?id=4">Sữa bột pha sẵn</a></li>
                        <li><a href="tab?id=5">Sữa mẹ bầu</a></li>
                    </ul>
                </form>
            </div>

            <div class="right">
                <h3 class="title" style="text-align: center;font-weight: 700">Login</h3>
                <center>
                    <div class="omai">
                        <form action="login" method="post">
                            <table style="padding: 0 auto;width: 90%;">
                                <tr>
                                    <td class="ten" >Username</td>
                                    <td><input style="border:none" class="nhap" name="user" value="${cookie.account.value}" type="text"></td>
                                </tr>
                                <tr>
                                    <td class="ten">Password</td>
                                    <td><input style="border:none" class="nhap" name="password" value="${cookie.pass.value}" type="password"></td>
                                </tr> 
                            </table>
                            <br/>
                            <input type="checkbox" name="rem" value="ON" ${(cookie.rem.value eq 'ON')?"checked":""}>Remember Me<br/>
                            <input style="width: 30%;" type="submit" value="Login"><br/>
                            <h5>Đăng kí nếu bạn chưa có tài khoản<a style="padding: 5px;" href="register">Register</a></h5>
                        </form>
                    </div>
                </center>
                <center>
                    <h3>${requestScope.er}</h3>
                </center>
            </div>
        </div>

        <%@include  file="footer.jsp" %>

    </body>

</html>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
crossorigin="anonymous"></script>