package uk.co.alt236.apkdetails.output;

import uk.co.alt236.apkdetails.print.section.SectionedKvPrinter;

import java.io.File;

public interface Output {
    void output(SectionedKvPrinter printer, File file);
}
