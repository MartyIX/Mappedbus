package io.mappedbus.sample.object;

import io.mappedbus.MappedBusMessage;
import io.mappedbus.MemoryMappedFile;


@SuppressWarnings("unused")
public class PriceUpdate implements MappedBusMessage {

    public static final int TYPE = 0;

    private int source;

    private int price;

    private int quantity;

    private char letter;

    public PriceUpdate() {
    }

    public PriceUpdate(int source, int price, int quantity) {
        this.source = source;
        this.price = price;
        this.quantity = quantity;
    }

    public int type() {
        return TYPE;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "PriceUpdate [source=" + source + ", price=" + price + ", quantity=" + quantity + ", letter=" + letter + "]";
    }

    public void write(MemoryMappedFile mem, long pos) {
        mem.putInt(pos, source);
        mem.putInt(pos + 4, price);
        mem.putInt(pos + 8, quantity);
        mem.putChar(pos + 12, letter);
    }

    public void read(MemoryMappedFile mem, long pos) {
        source = mem.getInt(pos);
        price = mem.getInt(pos + 4);
        quantity = mem.getInt(pos + 8);
        letter = mem.getChar(pos + 12);
    }

}