#include <stdio.h>
int main()
{
    char str[100000];
    scanf("%s", str);
    int length=0, count=0;
    for(int i=0; str[i]!='\0'; i++) length++;
    for(int i=0; i<length; i++){
        if(str[i]!='a' && str[i]!='e' && str[i]!='i' && str[i]!='o' && str[i]!='u') count++;
    }
    printf("%d", count);
    return 0;
}