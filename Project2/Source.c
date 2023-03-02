#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<Windows.h>
#include<locale.h>
#include<time.h>
void ReadFromFileStd(char* filename, char* buf, int bufSize)
{
	FILE* f;
	errno_t err=fopen_s(&f,filename, "r");
	if (err)
	{

		printf("can't");
		exit(-1);
	}
	fgets(buf, bufSize, f);
	fclose(f);

	

}
void readFromFileWin32(char* filename, char* buf, int bufsize)
{
	OFSTRUCT of = { 0 };
	HFILE f = OpenFile(filename, &of, OF_READ);
	DWORD bytesread = 0;
	ReadFile(f, buf, bufsize, &bytesread, NULL);
		buf[bytesread] = '\0';
		CloseHandle(f);
}
void writeFromFileStd(char* filename)
{
	

	FILE* f = fopen(filename, "w");
	char str[100];
	printf("\nenter new text\n");
	scanf("%s", str);
	fputs(str, f);
	fclose(f);

}
void writeFromWin32(char* filename)
{
	OFSTRUCT of = { 0 };
	HFILE fHandle = OpenFile(filename , &of, OF_CREATE | OF_WRITE);
	if (fHandle == NULL)
	{
		printf("Can't open the file!\n");
		exit(-1);
	}
	wchar_t str[]= L"Test output.\nGood luck!";
	WriteFile(fHandle, str, sizeof(str), NULL, NULL);
	CloseHandle(fHandle);

}
void copyFileWin32(char* filename ,char* buf, int bufsize)
{

	OFSTRUCT of = { 0 };
	HFILE f = OpenFile(filename, &of, OF_READ);
	DWORD bytesread = 0;
	ReadFile(f, buf, bufsize, &bytesread, NULL);
	buf[bytesread] = '\0';
	HFILE fHandle = OpenFile("copy.txt", &of, OF_CREATE | OF_WRITE);
	if (fHandle == NULL)
	{
		printf("Can't open the file!\n");
		exit(-1);
	}
	WriteFile(fHandle, buf,bufsize, NULL, NULL);
	CloseHandle(fHandle);
	CloseHandle(f);

}
void PrintFileAtributes(ULONG FileAtributes)
{
	if(FileAtributes & FILE_ATTRIBUTE_DIRECTORY)
	{
		printf("Directory\n");
	}
	if (FileAtributes & FILE_ATTRIBUTE_HIDDEN)
	{
		printf("Hidden\n");
	}
	if (FileAtributes & FILE_ATTRIBUTE_READONLY)
	{
		printf("Read Only\n");
	}
	
}
void FileAttribut(char* filename)
{
	OFSTRUCT of = { 0 };
	HFILE f = OpenFile(filename, &of,NULL);
	FILE_BASIC_INFO basicinfo;
	BOOL result;
	result = GetFileInformationByHandleEx(f,FileBasicInfo,&basicinfo,sizeof(basicinfo));
	printf("File Attributes\n");
	PrintFileAtributes(basicinfo.FileAttributes);

 

}
void TimeFileCreate(char* filename)
{
	OFSTRUCT of = { 0 };
	HFILE f = OpenFile(filename, &of, NULL);
	FILETIME day, day1, day2;
	SYSTEMTIME day3,day4;
	GetFileTime(f, &day, &day1, &day2);
	FileTimeToSystemTime(&day,&day3);
	FileTimeToSystemTime(&day2, &day4);
	printf("create %d.%d.%d   %d:%d\n", day3.wDay, day3.wMonth, day3.wYear, day3.wHour+5, day3.wMinute);
	printf("changes %d.%d.%d   %d:%d\n", day4.wDay, day4.wMonth, day4.wYear, day4.wHour + 5, day4.wMinute);

	CloseHandle(f);
}
int main()
{
	
	TimeFileCreate("in.txt");
	char buf[100]="fgklsdkfvlsfk";
	

	

}
