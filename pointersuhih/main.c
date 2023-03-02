#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>
#include<string.h>
int RANDOM(int min, int max)
{
     return min+rand() %(max-min+1);
}
 char *getRandomSerialNumber()
{ char *str = malloc(6);
    for(int i = 0;i<2;i++)
    { int b=RANDOM(65,90);
        str[i]=b;
        ;
    }
    str[2]='-';
    for(int i=3;i<6;i++)
    {
        str[i]=RANDOM(0,9)+'0';

    }
    return str;
}
char *reverseString(char str[])
{
    int j=strlen(str);
    char *reverse=malloc(j);
    for(int i=0;i<j;i++)
    {
        reverse[i]=str[j];
        j=j-1;
    }
    reverse[j+1]='\0';
    return reverse;
}

int main()
{
    setlocale(LC_ALL,"Rus");
    srand(time(NULL));
    short value=2;
    short *value1 =&value;
    printf ("%d   %p   %d ",value,&value,*value1);
    printf("Задание 2\n");
    int numbers [15];
    int summ=0;
    for(int i=0;i<15;i++)
    {
        numbers[i]=RANDOM(-100,100);
    }
    int *mass=numbers;
    for (int i =0;i<15;i++)
    {
        printf("%d  ",numbers[i]);
        summ+=numbers[i];
    }
    printf("\n");
    printf("Сумма чисел массива =%d\n",summ);
    for(int i =0;i<15;i++)
    {
        printf("%d  ",*(mass +i));
    }
    printf("\nЗадание 3\n");
    double massive[10];
    for(int i =0;i<10;i++)
    {
        massive[i]=(RANDOM(0,100)/100.0);
    }
    for(int i =0;i<10;i++)
    {
        printf("%f    %d\n",massive[i],i);
    }
    printf("\nЗадание 4\n");
    char *string=getRandomSerialNumber();
    printf("%s",string);
    free(string);
    printf("\nЗадание 5\n");
    char str2[]={'a','k','u','l','a'};
    char *str1=reverseString(str2);
    printf("%s",str1);
    free(str1);
    return 0;
}
