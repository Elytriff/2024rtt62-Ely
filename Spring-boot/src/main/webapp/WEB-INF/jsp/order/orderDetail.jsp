<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp" />

<h1 class="page-title">This is an Order detail page</h1>

<section>
    <div class="container">
        <div class="row pt-5">
            <div class="col-12">
                <h2 class="text-center">Order(${orderDetails.size()})</h2>
            </div>
        </div>
        <div class="row pt-3">
            <div class="col-12">
                <table class="table">
                    <tr>
                        <th><b>Order Id</b></th>
                        <th><b>Order date</b></th>
                        <th><b>Product Name</b></th>
                        <th><b>Quantity ordered</b></th>
                        <th><b>price Each</b></th>
                        <th><b>line item total</b></th>
                    </tr>
                    <c:forEach items="${orderDetails}" var="detail">
                        <tr>
                            <td>${detail.order_id}</td>
                            <td>${detail.order_date}</td>
                            <td>${detail.product_name}</td>
                            <td>${detail.quantity_ordered}</td>
                            <td>${detail.price_each}</td>
                            <td>${detail.line_item_total}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />