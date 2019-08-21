import org.scalatest.{FlatSpec, Matchers}
import output.FilterEncryptionStrings

class FilterEncryptionStringsUrlTest extends FlatSpec with Matchers {


  "Url" should "be well defined" in {
    FilterEncryptionStrings.isUrl("http://www.google.com") should be(true)
    FilterEncryptionStrings.isUrl("https://www.google.com") should be(true)
    FilterEncryptionStrings.isUrl("ftp://www.google.com") should be(true)
    FilterEncryptionStrings.isUrl("ftps://www.google.com") should be(true)

    FilterEncryptionStrings.isUrl("afhsgharsfghttp://google.comasdf") should be(true)

    FilterEncryptionStrings.isUrl("https://www.whatsapp.com/faq/client_search.php?") should be(true)
    FilterEncryptionStrings.isUrl("https://maps.google.com/maps?q=loc:(") should be(true)
    FilterEncryptionStrings.isUrl("https://www.whatsapp.com/faq/") should be(true)
    FilterEncryptionStrings.isUrl("https://www.whatsapp.com/android/current/WhatsApp.apk") should be(true)
    FilterEncryptionStrings.isUrl("https://graph.facebook.com/v2.2/") should be(true)
    FilterEncryptionStrings.isUrl("http://googlecom") should be(true)

    FilterEncryptionStrings.isUrl("http://clients3.google.com/generate_204") should be(true)
    FilterEncryptionStrings.isUrl("https://itunes.apple.com/lookup?id=") should be(true)
    FilterEncryptionStrings.isUrl("https://blog.whatsapp.com/ads") should be(true)
  }

  "Not Url" should "be not found" in {
    FilterEncryptionStrings.isUrl("thepiratebay.org") should be(false)
    FilterEncryptionStrings.isUrl("com.google.android.gms.common.GooglePlayServicesUtil") should be(false)
    FilterEncryptionStrings.isUrl("httpgooglecom") should be(false)
    FilterEncryptionStrings.isUrl("www.google.com") should be(false)
    FilterEncryptionStrings.isUrl("www.facebook.com") should be(false)
  }

}
