#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#define _CRT_SECURE_NO_WARNINGS;
void up()
{
    FILE* f = fopen("file.txt", "r");
    FILE* s = fopen("up.txt", "w");
    char str[100];

    while (fgets(str, 100, f) != NULL)
    {
        int len = strlen(str);
        for (int i = 0; i < len; i++)
        {
            if (str[i] >= 97 && str[i] <= 122)
            {
                str[i] -= 32;
            }

        }
        fputs(str, s);
        printf("%s\n", str);
    }
    fclose(s);
    fclose(f);
    return;
}
int main()
{
    up();
    return 0;
}