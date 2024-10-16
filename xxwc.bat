@echo off
setlocal
if "%~2" == "" (
    java  -cp "C:\Users\USER\Desktop\File Reader" mainCodecli all %1
) else  (
    java  -cp "C:\Users\USER\Desktop\File Reader" mainCodecli %1 %2
)

:end