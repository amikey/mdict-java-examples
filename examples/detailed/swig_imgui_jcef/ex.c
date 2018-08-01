#include <stdio.h>
 
int integer = 100;
 
int add(int a, int b)
{
        return a + b;
}
 
char* getString()
{
        return "Some string";
}
 
void printLine(const char* str)
{
        printf("%s\n", str);
}