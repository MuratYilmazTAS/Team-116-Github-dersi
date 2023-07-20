package day01;

public class C01 {
    /*
    git.init komutu workingDirectory'u git ile iliskilendirir
    bu komut her proje icin sadece 1 kere calistirilir
    bu komut ile birlikte icinde bulunulan klasoru kontrol etmeye baslar

    Bu klasorde her yedek almak istedigimizde
    commit yapmaliyiz.
    asagidaki 3 komut bizim dosyalarimiziher yedeklemek istedigimizde kullanilir

    1- git add . :son kaydedilen versiyondan sonra
                 projede yapilan degisiklikleri belirler
    2- git commit -m "commit ismi"
                     projenin son durumunu bir version olarak kaydeder
                     burada "" icinde yazilan commit isminin anlamli
                     olmasinda fayda vardir
                     ilerleyen asamalarda geri donus yapmak istersek
                     hangi commit'e donmek isteyecegimiz aciklamalardan
                     bulabiliriz.
        git ile ilisiklendirdigimiz dosyadaki class isimleri
        git durumuna gore renklenir
        kirmizi : bu class herhangi bir version'a eklenmedi
        mavi    : bu dosya bir versiona eklendi ama sonradan degisiklik yapilmis
        siyah   : bu class bir versiyonda son haliyle yedeklendi
                  sonrasinda hic bir degisiklik yok yani hersey kontrol altinda

     3- git push    local repo'da commit ettigimiz dosyalarimizi
                    uzak masaustu(Github)'ne yollamak icin kullanilir

                    Local bilgisayarda olusturdugumuz bir repoyu
                    Github'a yollamak ve orada yedeklemek istiyorsak
                    oncelikle github hesabi olusturmamiz
                    ve sonrasinda projemizi gonderecegimiz github repo'su hazirlama

                    Github da yeni bir repository olusturdugumuzda
                    ilk kullanimda local repo ile remote repo arasinda
                    baglanti kurmamiz gerekir

                    /Users/murattas/Desktop/GithubDersi/GithubDersi.iml


     */
}
