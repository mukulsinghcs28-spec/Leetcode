class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            // Reverse the row
            int left = 0;
            int right = image[i].length - 1;

            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                left++;
                right--;
            }

            // Invert the row
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = 1 - image[i][j];
            }
        }

        return image;
    }
}