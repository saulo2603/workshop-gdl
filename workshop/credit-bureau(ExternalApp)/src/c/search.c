#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(int argc, char **argv){    
	char rfc[] = "ROMS260389JSAULO1";	
	char line[500];
	
	FILE *file;
	file = fopen("loans.txt", "r");
	
	if (file) {
		printf("\n\n\n");
		
		/*Leyendo el archivo y asignando los caracteres a un arreglo local
			while ((c = getc(file)) != EOF){
				line[cont]=c;
				cont++;										
			}		
		*/
		
		while(fgets(line, sizeof(line), file)) 
		{
			if (strstr(line,rfc)) 
			{
				printf("%s", line);
			}			
		}
		
		printf("\n\n\n");
		fclose(file);
	}
	return 0;
}



