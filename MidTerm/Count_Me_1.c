#include <stdio.h>
int main() {
    int n, two=0, three=0;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        int x;
        scanf("%d", &x);
        if(x%2==0) two++;
        if(x%3==0 && x%2!=0) three++;
    }
    printf("%d %d", two, three);
    return 0;
}