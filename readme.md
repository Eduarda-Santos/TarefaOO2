#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(){
    int resultado, v[5], i, j, cont = 0, v_aleatorio[5];

    srand(time(NULL));
    printf("Digite 6 números: ");
    for(i = 0, i < 6, i++){
        scanf("%d", v[i]);
        v_aleatorio[i] = 1 + (rand() %60);
    }
return 0;
}