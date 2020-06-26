package lab.Builder;

public class StickBuilder {
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public int getKrepost() {
        return krepost;
    }

    private String brand;
    private String color;
    private String taste;
    private int krepost;

    private StickBuilder(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.taste = builder.taste;
        this.krepost = builder.krepost;
    }

    public static class  Builder {
        private String brand;
        private String color;
        private String taste;
        private int krepost;

        public Builder(String brand) {
            this.brand = brand;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setTaste(String taste) {
            this.taste = taste;
            return this;
        }

        public Builder setKrepost(int krepost) {
            this.krepost = krepost;
            return this;
        }

        public StickBuilder build() {
           return new StickBuilder(this);
        }
    }
}
