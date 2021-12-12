FROM nginx:latest

RUN apt-get update \
    && apt-get install -y git \
	&& apt-get install -y vim \
	&& rm -rf /var/lib/apt/lists/*

WORKDIR /usr/share/nginx/html

COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY website/ ./
