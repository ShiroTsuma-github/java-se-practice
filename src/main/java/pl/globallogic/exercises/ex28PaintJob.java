package pl.globallogic.exercises;

public class ex28PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double area = width * height;
        double buckets = Math.ceil(area / areaPerBucket);
        return (int) (buckets - extraBuckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        double area = width * height;
        double buckets = Math.ceil(area / areaPerBucket);
        return (int) buckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        double buckets = Math.ceil(area / areaPerBucket);
        return (int) buckets;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5,2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5,1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
    }
}
