#include <stdio.h>
int main()
{
    int t;
    scanf("%d", &t);
    for (int i = 0; i < t; i++)
    {
        char str[10000];
        scanf("%s", str);
        int cap=0, small=0, num=0;
        for(int j=0; str[j]!='\0'; j++){
            if(str[j]>='A' && str[j]<='Z') cap++;
            if(str[j]>='a' && str[j]<='z') small++;
            if(str[j]>='0' && str[j]<='9') num++;
        }
        printf("%d %d %d\n", cap, small, num);
    }
    return 0;
}