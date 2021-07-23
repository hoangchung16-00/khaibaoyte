<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row">
    <div class="col-xl-12 order-xl-6">
        <div class="card">
            <div class="card-header">
                <div class="row align-items-center">
                    <div class="col-8">
                        <h3 class="mb-0">Khai báo y tế toàn dân </h3>
                    </div>
                    <div class="col-4 text-right">
                        <a href="#!" class="btn btn-sm btn-primary">Settings</a>
                    </div>
                </div>
            </div>
            <div class="card-body">
                <form:form method="post" action="/khaibaoytetoandan" modelAttribute="khaiBaoYTeToanDanForm">
                    <h6 class="heading-small text-muted mb-4">Thông tin cá nhân</h6>
                    <div class="pl-lg-4">
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label">Họ tên (Chữ in hoa)(*) <form:errors path="hoten" cssStyle="color: red"/></label>
                                    <form:input type="text" class="form-control" path="hoten"/>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label">Số hộ chiếu / CMND / CCCD(*) <form:errors path="cccd" cssStyle="color: red"/></label>
                                    <form:input path="cccd" type="number"  class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-3">
                                <div class="form-group">
                                    <label class="form-control-label">Năm sinh(*) <form:errors path="namsinh" cssStyle="color: red"/></label>
                                    <form:input type="number" class="form-control" path="namsinh"/>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="form-group">
                                    <label class="form-control-label">Quốc tịch(*) <form:errors path="quoctich" cssStyle="color: red"/></label>
                                    <form:input type="text"  class="form-control" path="quoctich"/>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label">Giới Tính(*) <form:errors path="gioitinh" cssStyle="color: red"/></label>
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="Nam" checked="" path="gioitinh"/> Nam</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="NỮ" checked="" path="gioitinh"/> Nữ</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="Khác" checked="" path="gioitinh"/> Khác</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr class="my-4" />
                    <!-- Address -->
                    <h6 class="heading-small text-muted mb-4">Địa chỉ liên lạc tại Việt Nam</h6>
                    <div class="pl-lg-4">
                        <div class="row">
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label">Tỉnh/Thành Phố(*) <form:errors path="matinhtp" cssStyle="color: red"/></label>
                                    <form:select onchange="loadqh(this.value)" id="comboboxTinhTP" path="matinhtp" class="form-control select2-hidden-accessible">
                                        <form:options  items="${tinhtps}" itemLabel="tentinhtp" itemValue="matinhtp"/>
                                    </form:select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label">Quận/Huyện(*) <form:errors path="maquanhuyen" cssStyle="color: red"/></label>
                                    <form:select id="comboboxQuanHuyen" onchange="loadpx(this.value)" path="maquanhuyen" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn quốc tịch" aria-hidden="true">
                                    </form:select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label">Phường/Xã(*) <form:errors path="maphuongxa" cssStyle="color: red"/></label>
                                    <form:select path="maphuongxa" id="comboboxPhuongXa" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn quốc tịch" aria-hidden="true">
                                    </form:select>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="form-group">
                                    <label class="form-control-label">Số nhà, phố, tổ dân phố/thôn/đội(*) <form:errors path="diachi" cssStyle="color: red"/></label>
                                    <form:input path="diachi" type="text" class="form-control"/>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label">Điện Thoại(*) <form:errors path="SDT" cssStyle="color: red"/></label>
                                    <form:input path="SDT" type="number" class="form-control"/>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label">Email <form:errors path="email" cssStyle="color: red"/></label>
                                    <form:input path="email" type="email" class="form-control"/>
                                </div>
                            </div>
                            <div class="col-lg-8">
                                <div class="form-group">
                                    <label class="form-control-label">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố, quốc gia/vùng lãnh thổ nào có dịch(*) <form:errors path="denVungDich" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="denVungDich"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="denVungDich"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-8">
                                <div class="form-group">
                                    <label class="form-control-label">Trong vòng 14 ngày qua, Anh/Chị có tiếp xúc với người bị bệnh(*) <form:errors path="tiepXucNguoiBenh" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="tiepXucNguoiBenh"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="tiepXucNguoiBenh"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="form-group">
                                    <label class="form-control-label">Trong vòng 14 ngày qua, Anh/Chị có những dấu hiệu nào sau đây</label>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label">Ho(*) <form:errors path="ho" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="ho"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="ho"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label">Sốt(*) <form:errors path="sot" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="sot"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="sot"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label">Khó thở(*) <form:errors path="khoTho" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="khoTho"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="khoTho"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label">Mỏi cơ(*) <form:errors path="moiCo" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="moiCo"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="moiCo"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label">Đau họng(*) <form:errors path="dauHong" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="dauHong"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="dauHong"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label">Hắt hơi(*) <form:errors path="hatHoi" cssStyle="color: red"/></label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><form:radiobutton value="1" checked="" path="hatHoi"/> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><form:radiobutton value="0" checked="" path="hatHoi"/> Không</label></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <div class="col-4 text-right">
                                        <button class="btn btn-sm btn-primary" type="submit">Cập nhật tờ khai</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </form:form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    function loadqh(matinhtp) {
        $.ajax({
            type: 'GET',
            contentType:"application/json",
            url: '/loadQuanHuyenByTinhTP',
            data: {
                matinhtp : matinhtp
            },
            success: function (result) {
                var result = JSON.parse(result);
                var s = '';
                for(var i = 0; i < result.length; i++) {
                    s += '<option value="' + result[i].maquanhuyen + '">' + result[i].tenquanhuyen + '</option>';
                }
                $('#comboboxQuanHuyen').html(s);
            },
            error: function (e) {
                console.log("ERROR: ",e);
            }
        });
    }
    function loadpx(maqh) {
        $.ajax({
            type: 'GET',
            contentType:"application/json",
            url: '/loadPhuongXaByQuanHuyen',
            data: {
                maqh : maqh
            },
            success: function (result1) {
                var result1 = JSON.parse(result1);
                var s1 = '';
                for(var j = 0; j < result1.length; j++) {
                    s1 += '<option value="' + result1[j].maphuongxa + '">' + result1[j].tenphuongxa + '</option>';
                }
                $('#comboboxPhuongXa').html(s1);
            },
            error: function (e) {
                console.log("ERROR: ",e);
            }
        });
    }
</script>
