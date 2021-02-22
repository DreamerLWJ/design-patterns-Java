package creationmode.builder.computer;

import creationmode.builder.Builder;

/**
 * @author 罗文俊
 * 2021/2/21
 */
public class Computer {
    // 必须成员
    private String cpu;
    // 必须成员
    private String ram;
    // 可选成员
    private int usbCount;
    // 可选成员
    private String keyboard;
    // 可选成员
    private String display;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            // 传统的 Builder 和现行 Builder的区别
            return this;
        }

        public Builder addKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder addDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder("Intel", "SAMSUNG")
                .addDisplay("SAMSUNG 24 inch")
                .addKeyboard("雷蛇")
                .setUsbCount(2)
                .build();

        Computer computer2 = new Computer.Builder("AMD", "Kingston")
                .addKeyboard("戴尔")
                .build();
    }
}
