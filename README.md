# kcdafrica2022

```
eval $(minikube -p minikube docker-env)\n
```
```
docker images
```
```
docker tag kcdspringbootimage localhost:5000/kcdspringbootimage
```
```
docker images
```
```
docker push localhost:5000/kcdspringbootimage
```
```
docker run -d -p 5000:5000 --restart=always --name registry registry:2
```
```
docker push localhost:5000/kcdspringbootimage
```
```
kubectl create deployment kcdafricademo --image=localhost:5000/kcdspringbootimage --dry-run=client -o=yaml > deployment.yaml
```
```
echo --- >> deployment.yaml
```
```
kubectl create service clusterip kcdafricademo --tcp=8080:8080 --dry-run=client -o=yaml >> deployment.yaml
```
```
cat deployment.yaml
```
```
kubectl apply -f deployment.yaml 
```
```
kubectl get all
```
```
kubectl get pod
```
```
kubectl port-forward svc/kcdafricademo 8080:8080
```

# ECR

```
aws ecr create-repository \
--repository-name kcd-africa-demo-repo \
--image-tag-mutability IMMUTABLE \
--image-scanning-configuration scanOnPush=true
```

```
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin <your_ecr_repository_uri>
```

# Working with EKS

```
eksctl version
```
```
touch cluster.yaml
```
```
vi cluster.yaml
```
```
cat cluster.yaml
```
```
eksctl create cluster -f cluster.yaml
```
```
kubectl get svc
```
```
kubectl get pods --all-namespaces -o wide
```
```
touch eks-deployment.yaml
```
```
vi eks-deployment.yaml
```
```
cat eks-deployment.yaml
```
```
kubectl apply -f eks-deployment.yaml
```
```
kubectl get deployments
```
```
touch eks-service.yaml
```
```
vi eks-service.yaml
```
```
cat eks-service.yaml
```
```
kubectl apply -f eks-service.yaml
```
```
kubectl get pods -o wide
```
```
kubectl get nodes -o wide
```
