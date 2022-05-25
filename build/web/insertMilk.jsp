<%@page import="java.text.DecimalFormat"%>
<%@page import="model.Milk"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html lang="en">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="teststyle.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/editproduct.css"/>
        <script src="mycode.js"></script>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        <style>
            .detailProduct{
                text-align: center;
            }
            .detailProduct img{
                width: 250px;
                height: 300px;
            }
        </style>
        <title>VIVU Milk</title>
    </head>

    <body>
        <div class="head">
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
                                <a href="topproduct">Top 5 sản phẩm bán chạy</a>
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
                            <div style="position: absolute"><a href="MyCart.jsp"><img src="img/cart/shopping.jpg" style="width: 20px;height: 20px;border-radius:5px"></a></div>
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
                        <h5 style="color: black;font-weight: 700;font-size: 25px;font-family: cursive">Chính hãng 100%</h5>
                        <p style="color:black;background-color: rgba(255, 255, 255, 0.65);">"VIVU MILK là nhà cung cấp nổi tiếng và uy tín trên toàn thế giới.<br>
                            Được mọi người yêu thích và tin dùng"</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img style="height: 300px;opacity: 0.8" src="https://png.pngtree.com/thumb_back/fw800/back_our/20190622/ourmid/pngtree-blue-minimalist-milk-breakfast-banner-background-image_220965.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="color: black;font-weight: 700;font-size: 25px;font-family: cursive">Thơm Ngon</h5>
                        <p style="color:black;background-color: rgba(255, 255, 255, 0.8);">"Những sản phẩm của VIVU Milk luôn được chọn lọc dựa trên nhu cầu của khách hàng <br>nhằm cung cấp cho khách hàng những sản phẩm NGON-BỔ-RẺ nhất"</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img style="height: 300px"  src="https://www.wallpaperuse.com/wallp/70-706830_m.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="color: black;font-weight: 700;font-size: 25px;font-family: cursive">Phục vụ đẳng cấp 5 sao</h5>
                        <p style="color:black;background-color: rgba(255, 255, 255, 0.65);">Hơn 93.33% đánh giá 5 sao đến từ khách hàng.<br>Chúng tôi sẽ luôn luôn cố gắng để hoàn thiện để có thể phục vụ và làm hài lòng mọi khách hàng yêu quý.</p>
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
                <div class="title" style="text-align: center;">
                    <h3>Thêm sản phẩm</h3>
                </div>
                <div class="detailProduct">
                    <c:if test="${requestScope.mess!=null}">
                        <div><h3 style="color: green;font-weight: 800;font-size: 32px">Successfull</h3></div>
                    </c:if>
                    <c:if test="${requestScope.err==null}">
                        <c:set var="sp" value="${requestScope.milk}"></c:set>
                        <div style="margin-top:20px">
                            <form action="insert" method="post">
                                <table border="1px">
                                    <tr>
                                        <td class="left">ID</td>
                                        <td><input type="text" name="idProduct"></td>
                                    </tr>
                                    <tr>
                                        <td class="left">Tên sản phẩm</td>
                                        <td><input type="text" name="nameProduct"></td>
                                    </tr>
                                    <tr>
                                        <td class="left">Quantity Exist</td>
                                        <td><input type="number" name="quantity"></td>
                                    </tr>
                                    <tr>
                                        <td class="left">Price</td>
                                        <td><input type="text" name="price"></td>
                                    </tr>
                                    <tr>
                                        <td class="left">Describe</td>
                                        <td><input type="text" name="describe" ></td>
                                    </tr>
                                    <tr>
                                        <td class="left">Ngày sản xuất</td>
                                        <td><input type="date" name="published"></td>
                                    </tr>
                                    <tr>
                                        <td class="left">Link Img</td>
                                        <td><input type="text" name="img"></td>
                                    </tr>

                                </table>
                                <div class="hoanthanh">
                                    <h2>Choose Type</h2>
                                    <c:forEach items="${requestScope.list}" var="type">
                                        <input type="radio" value="${type.typeid}" name="type" required>${type.nameType}<br/>
                                    </c:forEach>
                                </div>

                                <div><input type="reset" value="Reset"><input type="submit" value="SAVE"></div>

                            </form>
                        </div>
                    </c:if>
                        <c:if test="${requestScope.err!=null}">
                            <h3>${requestScope.err}</h3>
                            <form action="insert" method="get">
                                <h2><a href="insertMilk">
                                        <input type="submit" value="Tiếp tục thêm sản phẩm">
                                    </a></h2>
                            </form>
                            
                        </c:if>
                </div>
                <!-- div right -->
            </div>
        </div>
        <%@include  file="footer.jsp" %>

    </body>

</html>