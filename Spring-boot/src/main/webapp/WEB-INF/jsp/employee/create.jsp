<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<!-- a page header -->
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <c:if test="${empty form.employeeId}">
                <h1 class="text-center">Create Employee</h1>
            </c:if>
            <c:if test="${not empty form.employeeId}">
                <h1 class="text-center">Create Employee</h1>
            </c:if>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row pt-5 ">
            <div class="col-12">
                <form action="/employee/createSubmit" method="post">
                    <!-----This hidden input field get populated when the edit function is working, this is the id of the employee to edit it is hidden to the eye but it is there passing value to the variable "form"-- -->
                    <input type="hidden" name="employeeId" value="${form.employeeId}">
                    <!---------------------------------------------- email input------------------------------ -->
                    <div class="row align-items-center justify-content-center">
                        <div class="col-2">
                            <label for="emailId" class="col-form-label">Email</label>
                        </div>
                        <div class="col-4">
                            <input type="text"
                                   id="emailId"
                                   name="email"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"
                                   value="${form.email}"
                            >
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('email')}">
                    <div class="row align-items-center justify-content-center">
                        <div class="offset-2 col-4">
                            <div style="color:red">
                                <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                    ${error.defaultMessage}<br>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    </c:if>

                    <!-----------------------------------------------------------First Name----------- -->
                    <div class="row align-items-center justify-content-center">
                        <div class="col-1">
                            <label for="firstNameId" class="col-form-label">First Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="firstNameId" name="firstName" class="form-control"
                                   value="${form.firstName}">
                        </div>
                    </div>

                    <!-----------------------------------------------------------Last Name----------- -->
                    <div class="row align-items-center justify-content-center">
                        <div class="col-1">
                            <label for="lastNameId" class="col-form-label">Last Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="lastNameId" name="lastName" class="form-control"
                                   value="${form.lastName}">
                        </div>
                    </div>

                    <!-----------------------------------------------------------Reports to dropdown ----------- -->

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="reportsTo" class="col-form-label">Reports To</label>
                        </div>
                        <div class="col-4">
                            <select id="reportsTo" name="reportsTo" class="form-control">
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option value="${employee.id}"
                                            <c:if test="${employee.id==form.reportsTo}">selected</c:if>
                                    >${employee.firstname} ${employee.lastname}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <!-----------------------------------------------------------Office Id dropdown ----------- -->

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="officeId" class="col-form-label">Office Id</label>
                        </div>
                        <div class="col-4">
                            <select id="officeId" name="officeId" class="form-control">
                                <c:forEach items="${officeAll}" var="office">
                                    <option value="${office.id}"
                                            <c:if test="${office.id==form.officeId}">selected</c:if>
                                    >${office.id} ${office.city}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <!-----------------------------------------------------------Extension dropdown ----------- -->

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="extension" class="col-form-label">Extension</label>
                        </div>
                        <div class="col-4">
                            <select id="extension" name="extension" class="form-control">
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option value="${employee.id}">${employee.extension}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <!-----------------------------------------------------------Job Title dropdown ----------- -->

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="jobTitle" class="col-form-label">Job Title</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="jobTitle" name="jobTitle" class="form-control"
                                   value="${form.jobTitle}">
                        </div>
                    </div>
                    <!-----------------------------------------------------------Vacation hours----------- -->
                    <div class="row align-items-center justify-content-center">
                        <div class="col-1">
                            <label for="vacationHoursId" class="col-form-label">Vacation hours</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="vacationHoursId" name="vacationHours" class="form-control">
                        </div>
                    </div>
                    <!-----------------------------------------------------------Submit button----------- -->

                    <div class="row justify-content-center ">
                        <div class="col-auto text-center">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
            </form>
        </div>
    </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>