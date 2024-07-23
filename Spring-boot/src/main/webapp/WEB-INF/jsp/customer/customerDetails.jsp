<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp" />

<h1 class="page-title">This is a Customer detail page</h1>

<section>
    <div class="row pt-5">
        <div class="col-12">
            <h2 class="text-center">Customer ${customer.customerName}</h2>
        </div>
    </div>
    <div class="row justify-content-center">
        <table class="table table-success table-striped table-bordered table-responsive" style="width: 750pt">
            <tr>
                <td style="font-weight: bolder;">Customer ID:</td>
                <td>${customer.id}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Full Name:</td>
                <td>${customer.contactFirstname} ${customer.contactLastname}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;"> State:</td>
                <td>${customer.state}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">City:</td>
                <td>${customer.city}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Country:</td>
                <td>${customer.country}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Address line 1:</td>
                <td>${customer.addressLine1}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Address line 2</td>
                <td>${customer.addressLine2}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Postal Code</td>
                <td>${customer.postalCode}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Phone</td>
                <td>${customer.phone}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Sales representative Employee</td>
                <td>${customer.salesRepEmployeeId}</td>
            </tr>
        </table>
    </div>

</section>

<jsp:include page="../include/footer.jsp" />