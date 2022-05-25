<%@page import="java.text.DecimalFormat"%>
<%@page import="model.Milk"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html lang="en">
    <%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="teststyle.css">
        <!--<link rel="stylesheet" href="css/bootstrap.min.css">-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

        <title>VIVU Milk</title>
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
                        <c:if test="${sessionScope.nick.role==1}">
                            <div class="dropdown">
                                <div class="dropbtn"><a href="profile?user=${sessionScope.nick.username}">${sessionScope.nick.logo}</a></div>
                                <div class="dropdown-content">
                                    <div class="ab" style="text-align: center">
                                        <a href="profile?user=${sessionScope.nick.username}">Profile</a>
                                        <a href="changepass">Change password</a>
                                        <a href="admin.jsp">Management</a>
                                        <a href="login">Logout</a>
                                    </div>
                                </div>
                            </div> 
                        </c:if>
                        <c:if test="${sessionScope.nick.role==0}">
                            <div class="dropdown">
                                <div class="dropbtn"><a href="profile?user=${sessionScope.nick.username}">${sessionScope.nick.logo}</a></div>
                                <div class="dropdown-content">
                                    <div class="ab" style="text-align: center">
                                        <a href="profile?user=${sessionScope.nick.username}">Profile</a>
                                        <a href="changepass">Change password</a>
                                        <a href="listorderCus">My orders</a>
                                        <a href="login">Logout</a>
                                    </div>
                                </div>
                            </div> 
                        </c:if>

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

        <!--        <div class="backShop">
                    <img src="background/backgr.png" alt="">
                </div>-->
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


        <!--        <div class="timkiem">
                    <form action="search">
                            <div>
                        <input type="text" placeholder="Tìm kiếm sản phẩm......" name="key">
                        <button onclick="this.form.submit()">Find</button>
                        <button><ion-icon name="search-circle-outline"></ion-icon></button>
                            </div>
                    </form>
                </div>-->

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
                    <h3>Danh mục sản phẩm</h3>
                </div>
                <div>
                    <form action="home">
                   
<!--                        <button value="1" name="sort" onclick="this.form.submit()">Sắp xếp theo giá giảm</button>
                    <button value="2" name="sort" onclick="this.form.submit()">Sắp xếp theo giá tăng</button>-->
                    <select name="sort">
                        <option value="0">Toàn bộ sản phẩm</option>
                        <option value="1" >Sắp xếp theo giá giảm</option>
                        <option value="2">Sắp xếp theo giá tăng</option>
                    </select>
                    <input type="submit" value="Xác nhận">
                </form>
                </div>
                    <%-- =========================================START HERE==================================== --%>
                <form name="f" action="buy" method="post">
                    <!--<input type="number" name="numForBuy" value="1">-->
                    <div class="products">
                        <jsp:useBean id="db" class="dal.MilkList"></jsp:useBean>
                        <c:forEach items="${sessionScope.data}" var="sp">
                            <div class="product">
                                <div class="img">
                                    <img src="${sp.img}" alt="">
                                </div>
                                <div class="info">
                                    <div class="nameProduct">${sp.name}</div>
                                    <div class="price">${sp.price}đ</div>
                                    <div><a href="detail?idProduct=${sp.id}" name="idProduct">Detail</a></div>
                                    <c:if test="${sessionScope.nick.role==null}">
                                        <div class="buy"><a href="login.jsp">Login to Buy</a></div>
                                    </c:if>
                                    <c:if test="${sessionScope.nick.role==1}">
                                        <div class="buy">
                                            <a href="editMilk?idProduct=${sp.id}">Edit Product</a>
                                            <hr>
                                            <div><a href="delete?id=${sp.id}" style="color:black">Delete Product</a></div>
                                        </div>
                                    </c:if>
                                    <c:if test="${sessionScope.nick.role==0}">
                                        <div class="slg" style="text-align: center">
                                            <div class="slgin">Số lượng mua:<input type="number" name="numForBuy${sp.id}" value="1"></div>
                                        </div>
                                        <div class="buy">
                                            <input style="border: none;background-color: red;color:white" type="submit" onclick="buy('${sp.id}')" value="Add To Cart">
                                        </div>
                                    </c:if>            
                                </div>
                            </div>
                        </c:forEach> 
                    </div>
                </form>
                <!-- phan 2 -->
                <c:set var="page" value="${sessionScope.page}"></c:set>
                <c:set var="num" value="${sessionScope.num}"></c:set>
                    <div class="phantrang" style="text-align: center;">
                    <c:forEach begin="${1}" end="${sessionScope.num}" var="i">
                        <a class="${i==page?"active":""}" href="home?page=${i}&sort=${sessionScope.forsort}">${i}</a>
                    </c:forEach>

                </div>

                <!--div them san pham-->
                <c:if test="${sessionScope.nick.role==1}">
                    <form action="insert">
                        <div class="insertForAdmin"><a href="insert">Thêm sản phẩm mới</a></div>
                    </form>
                </c:if>
                <!-- div right -->
            </div>
        </div>
        <!--        <div class="footer">
                    <div class="left">haha</div>
                    <div class="middle">hoho</div>
                    <div class="right">hihi</div>
                </div>-->


        <%@include  file="footer.jsp" %>

    </body>
    <script type="text/javascript">
        function buy(id) {
            document.f.action = "buy?idProduct=" + id;
            document.f.submit();
        }
        
        function sort(tt){
            document.x.action="home?sort="+tt;
            document.f.submit();
        }
    </script>
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