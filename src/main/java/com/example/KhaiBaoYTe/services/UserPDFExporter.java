package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

public class UserPDFExporter {
    private List<PhieuKhaiBao> phieuKhaiBaoList;

    public UserPDFExporter(List<PhieuKhaiBao> phieuKhaiBaoList) {
        this.phieuKhaiBaoList = phieuKhaiBaoList;
    }

    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("Ngay Khai Bao", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Den vung dich", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Tiep xuc nguoi benh", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Sot", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Ho", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Kho Tho", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Moi co", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Hat hoi", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Dau hong", font));
        table.addCell(cell);
    }

    private void writeTableData(PdfPTable table) {
        for (PhieuKhaiBao phieuKhaiBao : phieuKhaiBaoList) {
            table.addCell(String.valueOf(phieuKhaiBao.getNgaykhaibao()));
            if(phieuKhaiBao.getDenvungdich()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getTiepxucnguoibenh()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getSot()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getHo()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getKhotho()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getMoico()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getHathoi()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
            if(phieuKhaiBao.getDauhong()==1){
                table.addCell("Có");
            } else {
                table.addCell("Không");
            }
        }
    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(12);
        font.setColor(Color.BLUE);

        Paragraph p = new Paragraph("Lich su khai bao: "+phieuKhaiBaoList.get(0).getTaiKhoan().getTen()+" CCCD/CMND:"+phieuKhaiBaoList.get(0).getTaiKhoan().getCccd(), font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);

        PdfPTable table = new PdfPTable(9);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.0f ,1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f});
        table.setSpacingBefore(5);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();

    }
}
