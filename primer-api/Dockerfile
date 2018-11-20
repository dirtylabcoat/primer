FROM cantara/alpine-openjdk-jdk8:latest
ADD https://info.payara.fish/cs/c/?cta_guid=3462e195-f07d-44a2-8815-23bdbf456583&placement_guid=908761da-2736-4afd-b6e5-023e5a101b91&portal_id=334594&canon=https%3A%2F%2Fwww.payara.fish%2Fsoftware%2Fdownloads%2Fall-downloads%2F&redirect_url=APefjpGUO6MMsgxL2LHAaWVE0MfI5bjoZomM-P7XIYdUuFYC0xvCa-w5LKCgWu3jrYDXLG5uyKUx-m7hSMnPO0X2eIzGy4ydhfPwLPzQgUqBtKhvVjuec4LgSOqBElcG4adpUgEiBF_OKzvqNc_jj3I152egugnWZZv0MtLfEOJWCTj4JBqjD7mU98fF2gx75QqG1Kr7wBq42Q8raHxepiHF23ul23oADF39r973ayPMyxXLRnXlBcsSxtNJPUZ5JPWw1hO1NVIH&click=0fd48f04-7d06-40ba-aa00-0f01793b2a86&hsutk=359c55cb2b9ea8af618a5f7f577ad480&utm_referrer=https%3A%2F%2Fwww.google.se%2F&__hstc=229474563.359c55cb2b9ea8af618a5f7f577ad480.1542712377418.1542712377418.1542712377418.1&__hssc=229474563.1.1542712377418&__hsfp=753941244 /opt/payara-micro.jar
COPY ./target/primer.war /opt
WORKDIR /opt
CMD ["java", "-jar", "/opt/payara-micro.jar", "--deploy", "/opt/primer.war"]
EXPOSE 8080 5900
