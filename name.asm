global _start
	section .text
_start:
	; write(1, message, 13)
	mov	rax, 1
	mov	rdi, 1
	mov	rsi, message
	mov	rdx, 15
	syscall

	; exit(0)
	mov	eax, 60
	xor	rdi, rdi
	syscall
message:
	db	"Jason", 10

