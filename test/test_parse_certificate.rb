require 'openssl'
require "test/unit"

class TestParseCertificate < Test::Unit::TestCase
  CERT = File.dirname(__FILE__) + '/cert_with_ec_pk.cer'

  def test_certificate_parse_works_with_ec_pk_cert
    cer = OpenSSL::X509::Certificate.new(File.read(CERT))
    assert cer.to_s != nil
    assert cer.issuer.to_s != nil
    assert cer.subject.to_s != nil
    assert cer.extensions.to_s != nil
  end

  def test_certificate_with_ec_pk_cert_fails_requesting_pk
    cer = OpenSSL::X509::Certificate.new(File.read(CERT))
    assert_raise(OpenSSL::X509::CertificateError) { cer.public_key }
  end
end
