FROM alpine:latest

ARG primer_api_base_url
ENV PRIMER_API_BASE_URL=$primer_api_base_url

RUN apk update \
        && apk upgrade \
        && apk add --no-cache nginx bash\
        && adduser -D -g 'www' www \
        && mkdir /www \
        && mkdir -p /run/nginx/ \
        && chown -R www:www /var/lib/nginx \
        && chown -R www:www /www

COPY nginx.conf /etc/nginx/nginx.conf
COPY index.html /www
COPY index.js /www
RUN sed -i -e "s|PRIMER_API_BASE_URL|$PRIMER_API_BASE_URL|g" /www/index.js

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
