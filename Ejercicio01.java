public int[] invertirArray(int[] A) {
    int n = A.length;
    int[] Ain = new int[n];

    for (int i = 0; i < n; i++) {
        Ain[i] = A[n - 1 - i];
    }

    return Ain;
}
