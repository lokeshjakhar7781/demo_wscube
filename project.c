#include <stdio.h>
#include <stdlib.h>
int list();
void addition(int a,int b);
void subtraction(int a,int b);
void multiplication(int a,int b);
void divison(int a,int b);
int main() {
    int a;
    printf("Enter the first number : ");
    scanf("%d",&a);
    int b;
    printf("Enter the second number : ");
    scanf("%d",&b);
    while(1) {
        switch(list()) {
            case 1:
                addition(a,b);
                break;
            case 2:
                subtraction(a,b);
                break;
            case 3:
                multiplication(a,b);
                break;
            case 4:
                divison(a,b);
                break;
            case 5:
                exit(0);
            default :
                printf("You entered Wrong Choice");
        }
        int n;
        printf("Enter 0 for Exit and 1 for Main Menu : ");
        scanf("%d",&n);
        if(n==1) list();
        else exit(0);
    }
    return 0;
}
int list() {
    int ch;
    printf("\nMain Menu : ");
    printf("\n1.Additon");
    printf("\n2.Subtraction");
    printf("\n3.Multiplication");
    printf("\n4.Divison");
    printf("\n5.Exit\n\n");
    printf("Enter your choice : ");
    scanf("%d",&ch);
    return(ch);
}
void addition(int a,int b) {
    printf("Addition = %d\n",a+b);
}
void subtraction(int a,int b) {
    printf("Subtraction = %d\n",a-b);
}
void multiplication(int a,int b) {
    printf("Multiplication = %d\n",a*b);
}
void divison(int a,int b) {
    printf("Divison = %d\n",a/b);
}