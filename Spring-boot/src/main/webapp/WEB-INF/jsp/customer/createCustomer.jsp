<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section style="display: flex; justify-content: center; padding:20px">
    <h2>Create a customer</h2>
</section>

<section>
    <div class="container container_form">
        <form class="customerForm" action="/customer/submitCustomer">
            <input type="hidden" name="id" value="${form.id}">
            <!-- -------------------------------Name-------------------->
            <div class="input_label">
                <!-- -------------------------------attribute "name" in input field has to match the formbean variable-------------------->
                <div>
                    <input
                            type="text"
                            id="customerName"
                            name="customerName"
                            value="${form.customerName}"
                            class="form-control <c:if test="${bindingResult.hasFieldErrors('customerName')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="customerName">Name</label></div>
            </div>

            <c:if test="${bindingResult.hasFieldErrors('customerName')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('customerName')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>

            <!-- -------------------------------Last Name-------------------->
            <div class="input_label">
                <div>
                    <input type="text"
                            id="contactLastname"
                            name="contactLastname"
                            value="${form.contactLastname}"
                            class="form-control <c:if test="${bindingResult.hasFieldErrors('contactLastname')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="contactLastname">Last Name</label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('contactLastname')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('contactLastname')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>


            <!-- -------------------------------First Name-------------------->
            <div class="input_label">
                <div>
                    <input type="text"
                           id="contactFirstname"
                           name="contactFirstname"
                           value="${form.contactFirstname}"
                           class="form-control <c:if test="${bindingResult.hasFieldErrors('contactFirstname')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="contactFirstname">Contact First Name</label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('contactFirstname')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('contactFirstname')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>
            <!-- -------------------------------Phone-------------------->
            <div class="input_label">
                <div>
                    <input type="text"
                           id="phone"
                           name="phone"
                           value="${form.phone}"
                           class="form-control <c:if test="${bindingResult.hasFieldErrors('phone')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="phone">Phone number</label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('phone')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('phone')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>
            <!-- ------------------------------Address line 1 -------------------->
            <div class="input_label">
                <div>
                    <input type="text"
                           id="addressLine1"
                           name="addressLine1"
                           value="${form.addressLine1}"
                           class="form-control <c:if test="${bindingResult.hasFieldErrors('addressLine1')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="addressLine1">Address Line1</label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('addressLine1')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('addressLine1')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>
            <!-- -------------------------------Address line 2-------------------->
            <div class="input_label">
                <div><input type="text" id="addressLine2" name="addressLine2" class="form-control" value="${form.addressLine2}"/></div>
                <div><label class="label-form" for="addressLine2">Address Line2</label></div>
            </div>
            <!-- -------------------------------City-------------------->
            <div class="input_label">
                <div>
                    <input type="text"
                           id="city"
                           name="city"
                           value="${form.city}"
                           class="form-control <c:if test="${bindingResult.hasFieldErrors('city')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="city">City</label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('city')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('city')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>
            <!-- -------------------------------State-------------------->
            <div class="input_label">
                <div>
                    <input
                            type="text"
                            id="state"
                            name="state"
                            value="${form.state}"
                            class="form-control <c:if test="${bindingResult.hasFieldErrors('state')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="state">State</label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('state')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('state')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>
            <!-- -------------------------------postal Code-------------------->
            <div class="input_label">
                <div><input type="text" id="postalCode" name="postalCode" class="form-control" value="${form.postalCode}"/></div>
                <div><label class="label-form" for="postalCode">Postal Code</label></div>
            </div>
            <!-- -------------------------------Country -------------------->
            <div class="input_label">
                <div>
                    <input type="text"
                           id="country"
                           name="country"
                           value="${form.country}"
                           class="form-control <c:if test="${bindingResult.hasFieldErrors('country')}">is-invalid</c:if>"
                    />
                </div>
                <div><label class="label-form" for="country">Country </label></div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('country')}">
                <div class="text-danger">
                    <c:forEach items="${bindingResult.getFieldErrors('country')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>
            <!-- -------------------------------sales Rep Employee Id -------------------->
            <div class="input_label">
                <div>
                    <select id="salesRepEmployeeId" name="salesRepEmployeeId"
                            class="form-control">
                        <option disabled selected value> -- select an option --</option>
                        <c:forEach items="${salesRepresentatives}" var="employeeVar">
                            <option value="${employeeVar.id}"
                                    <c:if test="${employeeVar.id==form.salesRepEmployeeId}">selected</c:if>>
                                    ${employeeVar.id} ${employeeVar.firstname} ${employeeVar.lastname}
                            </option>
                        </c:forEach>
                    </select>
                </div>

                <div><label class="label-form" for="salesRepEmployeeId">Sales Rep Employee Id </label></div>
            </div>
            <!-----------------------------------------------------------Submit button----------- -->
            <div class="row justify-content-center ">
                <div class="col-auto text-center">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>

        </form>
    </div>

</section>

<jsp:include page="../include/footer.jsp"/>