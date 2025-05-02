#include <stdio.h>
int main() {
    int t;
    scanf("%d", &t);
    for(int i=0; i<t; i++){
        int M1, M2, D;
        scanf("%d %d %d", &M1, &M2, &D);
        int x = (M1*D)/(M1+M2);
        D-=x;
        printf("%d\n", D);
    }
    return 0;
}