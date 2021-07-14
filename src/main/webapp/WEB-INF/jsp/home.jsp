<%@ page contentType="text/html; charset=UTF-8" %>

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
                <form>
                    <h6 class="heading-small text-muted mb-4">Thông tin cá nhân</h6>
                    <div class="pl-lg-4">
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-username">Họ tên (Chữ in hoa)</label>
                                    <input type="text" id="input-username" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Số hộ chiếu / CMND / CCCD</label>
                                    <input type="email" id="input-email" class="form-control">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-3">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-first-name">Năm sinh</label>
                                    <input type="text" id="input-first-name" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Quốc tịch</label>
                                    <input type="text" id="input-last-name" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-first-name">Năm sinh</label>
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Nam" checked="" name="fields[gender]">&nbsp;Nam</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Nu" name="fields[gender]">&nbsp;Nữ</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Khac" name="fields[gender]">&nbsp;Khác</label></td>
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
                                    <label class="form-control-label">Tỉnh/Thành Phố</label>
                                    <select name="fields[nation]" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn quốc tịch" data-select2-id="input17247" tabindex="-1" aria-hidden="true">
                                        <option value="">Chọn</option>
                                        <option value="">Ma Cao(Trung Quốc)</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label">Quận/Huyện</label>
                                    <select name="fields[nation]" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn quốc tịch" data-select2-id="input17247" tabindex="-1" aria-hidden="true">
                                        <option value="">Chọn</option>
                                        <option value="">Ma Cao(Trung Quốc)</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="form-group">
                                    <label class="form-control-label">Phường/Xã</label>
                                    <select name="fields[nation]" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn quốc tịch" data-select2-id="input17247" tabindex="-1" aria-hidden="true">
                                        <option value="">Chọn</option>
                                        <option value="">Ma Cao(Trung Quốc)</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-first-name">Số nhà, phố, tổ dân phố/thôn/đội</label>
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-first-name">Điện Thoại</label>
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Email</label>
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-8">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố, quốc gia/vùng lãnh thổ nào có dịch</label>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-8">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Trong vòng 14 ngày qua, Anh/Chị có tiếp xúc với người bị bệnh</label>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Trong vòng 14 ngày qua, Anh/Chị có những dấu hiệu nào sau đây</label>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Ho</label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Sốt</label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Khó thở</label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Mỏi cơ</label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Đau họng</label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-last-name">Hắt hơi</label>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                <div class="form-group">
                                    <table class="">
                                        <tbody>
                                        <tr>
                                            <td><label><input type="radio" value="Có" checked="" name="fields[gender]"> Có</label></td>
                                            <td>&nbsp;</td>
                                            <td><label><input type="radio" value="Không" name="fields[gender]"> Không</label></td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr class="my-4" />
                    <!-- Description -->
                    <h6 class="heading-small text-muted mb-4">About me</h6>
                    <div class="pl-lg-4">
                        <div class="form-group">
                            <label class="form-control-label">About Me</label>
                            <textarea rows="4" class="form-control" placeholder="A few words about you ...">A beautiful Dashboard for Bootstrap 4. It is Free and Open Source.</textarea>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>