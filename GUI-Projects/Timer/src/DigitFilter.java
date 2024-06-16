/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
/**
 *
 * @author Eldoran
 */
public class DigitFilter extends DocumentFilter {
    private int maxLength;

    public DigitFilter(int maxLength) {
    this.maxLength = maxLength;
    }
     @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (isValidInput(fb.getDocument().getLength() + string.length(), string)) {
            super.insertString(fb, offset, string.replaceAll("[^0-9]", ""), attr);
        }
    }
    
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (isValidInput(fb.getDocument().getLength() + text.length() - length, text)) {
            super.replace(fb, offset, length, text.replaceAll("[^0-9]", ""), attrs);
        }
    }
    
    
    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }
     private boolean isValidInput(int newLength, String input) {
        return newLength <= maxLength && input.matches("[0-9]*");
    }
    
}
