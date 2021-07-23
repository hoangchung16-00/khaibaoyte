<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container-fluid mt--6">
    <div class="row">
        <div class="col">
            <div class="card">
                <!-- Card header -->
                <div class="card-header border-0">
                    <h3 class="mb-0">Thống kê lịch sử khai báo</h3>

                </div>
                <div class="card-header border-0">
                    <h3 class="mb-0">${taikhoan.ten} - CCCD/CMND Số:${taikhoan.cccd} </h3>
                    <form:form action="/searchCCCD" method="post" modelAttribute="searchForm" class="navbar-search navbar-search-light form-inline mr-sm-3" id="navbar-search-main">
                        <div class="form-group mb-0">
                            <div class="input-group input-group-alternative input-group-merge">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-search"></i></span>
                                </div>
                                <form:input path="cccd" class="form-control" placeholder="Search" type="text"/>
                            </div>
                        </div>
                        <button type="button" class="close" data-action="search-close" data-target="#navbar-search-main" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </form:form>
                </div>
                <!-- Light table -->
                <div class="table-responsive">
                    <table class="table align-items-center table-flush">
                        <thead class="thead-light">
                        <tr>
                            <th scope="col" class="sort" data-sort="name">Ngày khai báo</th>
                            <th scope="col" class="sort" data-sort="status">Sốt</th>
                            <th scope="col" class="sort" data-sort="status">Ho</th>
                            <th scope="col" class="sort" data-sort="completion">Khó thở</th>
                            <th scope="col" class="sort" data-sort="status">Mỏi cơ</th>
                            <th scope="col" class="sort" data-sort="status">Hắt hơi</th>
                            <th scope="col" class="sort" data-sort="status">Đau họng</th>
                            <th scope="col"></th>
                        </tr>
                        </thead>
                        <tbody class="list">
                            <c:forEach items="${phieuKhaiBaos}" var="phieuKhaiBao">
                                <tr>
                                    <th scope="row">
                                        <div class="media align-items-center">
                                            <div class="media-body">
                                                <span class="name mb-0 text-sm">${phieuKhaiBao.ngaykhaibao}</span>
                                            </div>
                                        </div>
                                    </th>
                                    <td class="budget">
                                        <c:if test="${phieuKhaiBao.sot==true}">
                                            <img src="/img/true.png"  width="60" height="60">
                                        </c:if>
                                    </td>
                                    <td class="budget">
                                        <c:if test="${phieuKhaiBao.ho==true}">
                                            <img src="/img/true.png"  width="60" height="60">
                                        </c:if>
                                    </td>
                                    <td class="budget">
                                        <c:if test="${phieuKhaiBao.khotho==true}">
                                            <img src="/img/true.png" width="60" height="60">
                                        </c:if>
                                    </td>
                                    <td class="budget">
                                        <c:if test="${phieuKhaiBao.moico==true}">
                                            <img src="/img/true.png" width="60" height="60">
                                        </c:if>
                                    </td>
                                    <td class="budget">
                                        <c:if test="${phieuKhaiBao.hathoi==true}">
                                            <img src="/img/true.png" width="60" height="60">
                                        </c:if>
                                    </td>
                                    <td class="budget">
                                        <c:if test="${phieuKhaiBao.dauhong==true}">
                                            <img src="/img/true.png" width="60" height="60">
                                        </c:if>
                                    </td>
                                    <td class="text-right">
                                        <div class="dropdown">
                                            <a class="btn btn-sm btn-icon-only text-light" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i class="fas fa-ellipsis-v"></i>
                                            </a>
                                            <div class="dropdown-menu dropdown-menu-right dropdown-menu-arrow">
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- Card footer -->
                <div class="card-footer py-4">
                    <c:if test="${taikhoan.cccd!=null}">
                        <nav aria-label="...">
                            <ul class="pagination justify-content-end mb-0">
                                <c:forEach begin="1" end="${pageSize}" varStatus="index">
                                    <li class="page-item active">
                                        <a class="page-link" href="/thongkelichsukhaibao/${taikhoan.cccd}?page=${index.index}">${index.index}</a>
                                    </li>
                                </c:forEach>
                            </ul>
                        </nav>
                    </c:if>

                </div>
            </div>
        </div>
    </div>
</div>