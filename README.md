 
# habbo-decoder
Tool intended to help with Habbo FUSE 0.2.0 packets encoding and decoding. Includes encoders and decoders for Base64, VL64/Wire and character-to-number, and decoding and splitting of VL64 strings. Intended to replace the old 'Nillus Packet Scout' with something modern, multiplatform (Linux and Windows) and without the errors the original program had.

Made in Java 17 and JavaFX, replicating as close as possible the looks of the original Habbo Console design.

Version 1.0.

![https://i.imgur.com/UjToSol.png](https://i.imgur.com/UjToSol.png)
![https://i.imgur.com/Wt9OAkj.png](https://i.imgur.com/Wt9OAkj.png)
![https://i.imgur.com/Srmzf1I.png](https://i.imgur.com/Srmzf1I.png)
![https://i.imgur.com/omsgDhu.png](https://i.imgur.com/omsgDhu.png)

[Runnable for Linux](https://archive.alcosmos.net/Alcosmos/Git/habbo_decoder/binaries/HabboCalculator-Linux.zip)

[Runnable for Windows](https://archive.alcosmos.net/Alcosmos/Git/habbo_decoder/binaries/HabboCalculator-Windows.zip)

[Java JAR](https://archive.alcosmos.net/Alcosmos/Git/habbo_decoder/binaries/HabboDecoder-1.0.jar)

'HabboDecoder.exe' for Windows, and 'HabboDecoder.sh' for Linux.
Both the Windows executable and Linux script make use of the included JAR by using the bundled JDKs located under the 'jdk' directory. No external Java install is required.

Alternatively, you can run the 'HabboDecoder-1.0.jar' JAR file directly, as long as you have Java 17+ installed along with the JavaFX library.

Distributed under GNU General Public License v3.0.
Bundles OpenJDK and JavaFX binaries, which are distributed under GNU General Public License v2.0.

## Project info
IntelliJ IDEA project built over Maven in an Arch Linux machine, making use of OpenJDK 17.0 and JavaFX 17.

## Updates
* **v1.0** - Initial release.
---
If you found a bug or got any problem with it, feel free to open an issue in the repository or contact me in any other way. But please, try by yourself before contacting me.
