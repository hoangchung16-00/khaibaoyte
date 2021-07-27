package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static org.apache.poi.ss.util.CellUtil.createCell;

public class UserExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<PhieuKhaiBao> phieuKhaiBaoList;
    public UserExcelExporter(List<PhieuKhaiBao> phieuKhaiBaos) {
        this.phieuKhaiBaoList = phieuKhaiBaos;
        workbook = new XSSFWorkbook();
    }
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Phiếu khai báo");

        Row row = sheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        createCell(row, 0, "CCCD", style);
        createCell(row, 1, "Họ tên", style);
        createCell(row, 2, "Số điện thoại", style);
        createCell(row, 3, "Email", style);
        createCell(row, 4, "Địa chỉ", style);
        createCell(row, 4, "Ngày khai báo", style);
        createCell(row, 5, "Nơi đi", style);
        createCell(row, 6, "Nơi đên", style);
        createCell(row, 7, "Ngày đi", style);
        createCell(row, 8, "Ngày đến", style);
        createCell(row, 9, "Đên vùng dịch", style);
        createCell(row, 10, "Tiếp xúc người bệnh", style);
        createCell(row, 11, "Sốt", style);
        createCell(row, 12, "Ho", style);
        createCell(row, 13, "Khó thở", style);
        createCell(row, 14, "Mỏi cơ", style);
        createCell(row, 15, "Đau họng", style);
        createCell(row, 16, "Hắt hơi", style);
    }
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        } else if(value instanceof Byte){
            cell.setCellValue((Byte) value);
        }
        else {
            cell.setCellValue((String) value);
        }

        cell.setCellStyle(style);
    }
    private void writeDataLines() {
        int rowCount = 1;

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        for (PhieuKhaiBao phieuKhaiBao : phieuKhaiBaoList) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
            String ngaydi,ngayden;
            if(phieuKhaiBao.getNgaydi()==null){
                ngaydi = "";
            } else {
                ngaydi = phieuKhaiBao.getNgaydi().toString();
            }
            if(phieuKhaiBao.getNgayden()==null){
                ngayden = "";
            } else {
                ngayden = phieuKhaiBao.getNgayden().toString();
            }
            createCell(row, columnCount++, phieuKhaiBao.getTaiKhoan().getCccd(), style);
            createCell(row, columnCount++, phieuKhaiBao.getHoten(), style);
            createCell(row, columnCount++, phieuKhaiBao.getSdt(), style);
            createCell(row, columnCount++, phieuKhaiBao.getEmail(), style);
            createCell(row, columnCount++, phieuKhaiBao.getDiachi(), style);
            createCell(row, columnCount++, phieuKhaiBao.getNgaykhaibao().toString(), style);
            createCell(row, columnCount++, phieuKhaiBao.getNoidi(), style);
            createCell(row, columnCount++, phieuKhaiBao.getNoiden(), style);
            createCell(row, columnCount++, phieuKhaiBao.getDiachi(), style);
            createCell(row, columnCount++, ngaydi, style);
            createCell(row, columnCount++, ngayden, style);
            createCell(row, columnCount++, phieuKhaiBao.getDenvungdich(), style);
            createCell(row, columnCount++, phieuKhaiBao.getTiepxucnguoibenh(), style);
            createCell(row, columnCount++, phieuKhaiBao.getSot(), style);
            createCell(row, columnCount++, phieuKhaiBao.getHo(), style);
            createCell(row, columnCount++, phieuKhaiBao.getKhotho(), style);
            createCell(row, columnCount++, phieuKhaiBao.getMoico(), style);
            createCell(row, columnCount++, phieuKhaiBao.getDauhong(), style);
            createCell(row, columnCount++, phieuKhaiBao.getHathoi(), style);
        }
    }
    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();

    }
}
